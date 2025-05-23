package com.org.task_management.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Task {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long  id;

    @NotBlank(message = "Title Can't be empty")
    private String title;

    private String description;

    @Column(name = "completed_time")
    private LocalDateTime completedTime;

    private boolean completed;

}
