package com.example.fullshot.general.login.model;

import lombok.*;

import javax.persistence.*;

@Data               /* @ToString, @EqualsAndHashCode, @Getter, @Setter, @RequiredArgsConstructor 한번에 사용  */
@AllArgsConstructor
@NoArgsConstructor  /* @Entity 어노테이션은 기본생성자가 필수로 있어야하는데 @NoArgsConstructor로 대체 */
@Builder
@Entity             /* 해당 클래스를 JPA Entity로 관리한다 */
public class User {

    @Id /* 해당 프로퍼티가 테이블의 primary key 역할을 한다는 것을 표현 */
    @GeneratedValue(strategy = GenerationType.IDENTITY) /* 기본 키 생성을 데이터베이스에 위임 / id값을 null로 하면 DB가 알아서 AUTO_INCREMENT 해준다.(Ex) MySQL, PostgreSQL, SQL Server DB2 등) */
    private Long no;

    @NonNull /* @NonNull을 허용하지 않을 경우 / @Nullable : null을 허용할 경우 */
    @Column(name = "user_id", nullable = false, updatable = false)
    /* @Column 어노테이션은 객체 필드와 DB테이블 컬럼을 맵핑한다.
    *   name : 맵핑할 테이블의 컬럼 이름을 지정
    *   nullable : NULL을 허용할지, 허용하지 않을지 결정
    *   unique : 제약조건을 걸 때 사용
    *   precsion, scale : BigInteger, BigDecimal 타입에서 사용, 각각 소수점 포함 자리수, 소수의 자리수를 의미
    *   length : varchar의 길이를 조정합니다. 기본값으로 255가 입력
    */
    private String userId;



}
