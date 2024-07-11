package url.shortner.avocado.domain.member.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import url.shortner.avocado.domain.member.domain.Member;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail(String email);
}
