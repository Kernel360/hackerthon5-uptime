package org.server.core.token.domain;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TokenRepository extends JpaRepository<Token, Long> {
    Optional<Token> findByMemberId(Long memberId);
}
