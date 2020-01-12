package me.zhengjie.modules.system.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author zhoudanwei
 * @description
 * @date 2020/1/10
 **/
@Entity
@Getter
@Setter
@Table(name = "province")
public class Province implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @NotNull(groups = Province.Update.class)
    private int id;

    @Column(name = "code", nullable = false)
    @NotBlank
    private String code;

    @Column(name = "name", nullable = false)
    @NotBlank
    private String name;

    @Column(name = "province", nullable = false)
    @NotBlank
    private String province;

    @Column(name = "city", nullable = false)
    @NotBlank
    private String city;

    @Column(name = "area", nullable = false)
    @NotBlank
    private String area;

    @Column(name = "town", nullable = false)
    @NotBlank
    private String town;

    public @interface Update {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Province province = (Province) o;
        return Objects.equals(id, province.id) &&
                Objects.equals(name, province.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
