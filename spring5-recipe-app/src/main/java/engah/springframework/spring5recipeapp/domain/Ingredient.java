package engah.springframework.spring5recipeapp.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
@Entity
public class Ingredient {
    private  String description;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal amount;
    @ManyToOne
    private Recipe recipe;
    public Ingredient() {
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
    }

    public Ingredient(String description, BigDecimal amount, UnitOfMeasure uom, Recipe recipe) {
        this.description = description;
        this.amount = amount;
        this.uom = uom;
        this.recipe = recipe;
    }
    @OneToOne(fetch = FetchType.EAGER)
private UnitOfMeasure uom;

    public UnitOfMeasure getUnitOfMeasure() {
        return uom;
    }

    public void setUnitOfMeasure(UnitOfMeasure unitOfMeasure) {
        this.uom = unitOfMeasure;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescriptions(String descriptions) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }
}
