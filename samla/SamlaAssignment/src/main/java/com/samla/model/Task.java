package com.samla.model;




import java.sql.Timestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;


@Entity
@Data
public class Task {
	@Id
	Integer id;
    String answer;
    String  question;
    Integer  value;
    Timestamp airdate;        //": "2012-01-02T20:00:00.000Z",
    Timestamp created_at;     //": "2022-12-30T20:36:22.537Z",
    Timestamp updated_at;     //": "2022-12-30T20:36:22.537Z",
    Integer categoryid;
    Integer game_id;
    Integer invalid_count;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private Category category;
    
}
