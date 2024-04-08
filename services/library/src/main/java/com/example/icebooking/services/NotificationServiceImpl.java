// package com.example.icebooking.services;

// import java.util.ArrayList;
// import java.util.List;

// import com.example.icebooking.models.Utilisateur;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.context.SecurityContextHolder;
// import org.springframework.stereotype.Service;

// import com.example.icebooking.models.Notification;
// import com.example.icebooking.repositories.NotificationRepository;

// import lombok.AllArgsConstructor;

// @AllArgsConstructor
// @Service
// public class NotificationServiceImpl implements NotificationService {
// @Autowired
// private final NotificationRepository notificationRepository;

// @Override
// public void createNotification(Notification notification){
// Utilisateur utilisateur =(Utilisateur)
// SecurityContextHolder.getContext().getAuthentication().getPrincipal();
// notification.setUtilisateur(utilisateur);
// this.notificationRepository.save(notification);
// }
// @Override
// public void deleteNotification(Integer id){
// this.notificationRepository.deleteById(id);
// }
// @Override
// public Notification getNotification(Integer id){

// return notificationRepository.findById(id).orElse(null);
// }

// @Override
// public List<Notification> getNotifications(){
// List<Notification> notifications =new ArrayList<>();
// notificationRepository.findAll().forEach(notification ->{
// notifications.add(notification);

// });

// return notifications;
// }

// }
