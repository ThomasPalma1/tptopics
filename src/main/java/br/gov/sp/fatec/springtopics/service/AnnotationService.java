package br.gov.sp.fatec.springtopics.service;

import br.gov.sp.fatec.springtopics.entity.Annotation;
import br.gov.sp.fatec.springtopics.entity.User;
import br.gov.sp.fatec.springtopics.repository.AnnotationRepository;
import br.gov.sp.fatec.springtopics.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class AnnotationService implements InterfaceAnnotationService {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private AnnotationRepository annotationRepo;

    @Transactional
    public Annotation newAnnotation(Annotation annotation) {
        Long idUser = annotation.getUser().getId();
        Optional<User> userOp = userRepo.findById(idUser);
        if (userOp.isEmpty()) {
            throw new IllegalArgumentException("User does not exist!");
        }
        if (annotation.getDatetime() == null) {
            annotation.setDatetime(LocalDateTime.now());
        }
        annotation.setUser(userOp.get());
        return annotationRepo.save(annotation);
    }

    @Override
    public List<Annotation> findAll() {
        return annotationRepo.findAll();
    }
}
