package pl.exe;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "PERMISSIONS")
public class Permission {

    @Id
    public Long id;

    @Column
    public String name;

    @Column
    public String description;

    @Column
    @Temporal(TemporalType.DATE)
    public Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
