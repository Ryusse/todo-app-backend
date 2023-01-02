package com.uno.uno.entities;

import java.time.LocalDate;
import javax.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "task")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Task {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "title")
	private String title;
	@Column(name = "date")
	private LocalDate date;
	@Column(name = "favorite")
	private Integer favorite;
	@Column(name = "completed")
	private Integer completed;
}
