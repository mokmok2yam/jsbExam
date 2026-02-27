package com.back.jsb_exam;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
@ActiveProfiles("test")
public class QuestionRepositoryTest {
    @Autowired
    private QuestionRepository questionRepository;
    @Autowired
    private AnwerRepository anwerRepository;

    @Test
    void t1() {
        List<Question> all = this.questionRepository.findAll();
        assertEquals(2, all.size());

        Question q = all.get(0);
        assertEquals("sbb가 무엇인가요?", q.getSubject());
    }
    @Test
    void t2(){
        Question q1 = questionRepository.findById(1).get();
        assertEquals("sbb가 무엇인가요?",q1.getSubject());
    }
    @Test
    void t3(){
        Question q1=questionRepository.findBySubject("sbb가 무엇인가요?").get();
        Assertions.assertThat(q1.getId()).isEqualTo(1);
        Assertions.assertThat(q1.getContent()).isEqualTo("sbb에 대해서 알고 싶습니다.");
    }
}
