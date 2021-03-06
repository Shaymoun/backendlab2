package com.example.app.category;

import com.example.app.brand.Brand;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 45, nullable = false, unique = true)
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    public Category() {
    }
    public Category(Integer id) {
        this.id = id;
    }
    public Category(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
