package com.spring.ch01.ex01;

import static org.mockito.Mockito.*;
import org.junit.Test;
import com.spring.ch01.ex01.BraveKnight;
import com.spring.ch01.ex01.Quest;

public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
