package com.example.fullshot.general.login.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor  /* @Entity 어노테이션은 기본생성자가 필수로 있어야하는데 @NoArgsConstructor로 대체 */
@Builder
@Entity /* 해당 클래스를 JPA Entity로 관리한다 */
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer no;

    @NonNull
    @Column(name = "user_id", nullable = false, updatable = false)
    private String userId;

    public void setNo(Integer no) {
        this.no = no;
    }

    public Integer getNo() {
        return no;
    }

}
