package url.shortner.avocado.domain.member.domain;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import url.shortner.avocado.global.config.BaseEntity;

@Getter
@NoArgsConstructor
@Entity
public class Member extends BaseEntity {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private AuthProvider authprovider;

    @Column(nullable = false, unique = true)
    private String email;

    private String password;
    private String oAuth2Id;
    private boolean activated;

    @Builder
    public Member(String email, String password, AuthProvider provider, String oAuth2Id, boolean activated) {
        this.email = email;
        this.password = password;
        this.authprovider = provider;
        this.oAuth2Id = oAuth2Id;
        this.activated = activated;
    }
    public void activateMember() {
        this.activated = true;
    }
}
