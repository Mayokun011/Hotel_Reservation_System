package com.brightonhotel.HotelReservationSystem.entity;

import jakarta.persistence.Entity;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Room{

    private Long id;
    private String roomNo;
    private String roomAlias;
    private LocalDateTime bookedAt;
    private int lodgingHours;
    private LocalDateTime exitTime;
    private double price;
    @CreationTimestamp
    private LocalDateTime createdAt;
    private String createdBy;
    @UpdateTimestamp
    private LocalDateTime modifiedAt;
    private String modifiedBy;
}
