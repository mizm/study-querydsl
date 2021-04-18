package study.querydsl.repository;


import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
import study.querydsl.dto.MemberSearchCondition;
import study.querydsl.dto.MemberTeamDto;
import study.querydsl.dto.QMemberTeamDto;
import study.querydsl.entity.Member;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

import static org.springframework.util.StringUtils.hasText;
import static study.querydsl.entity.QMember.member;
import static study.querydsl.entity.QTeam.team;

public interface MemberRepository extends JpaRepository<Member,Long>, MemberRepositoryCustom, QuerydslPredicateExecutor<Member> {
    /**
     * QuerydslPredicateExecutor
     * querydsl의 조건을 적용해서 쉽게 사용할 수 있게 해준다ㅓ
     * 하지만 join을 사용불가
     * 클라이언트가 QueryDsl에 의존해야한다.
     */

    //select m from Member m where m.username = :username
    List<Member> findByUsername(String username);
}
