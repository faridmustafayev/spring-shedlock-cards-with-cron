package com.example.spring.lesson18.scheduler;

import com.example.spring.lesson18.service.abstraction.CardService;
import lombok.RequiredArgsConstructor;
import net.javacrumbs.shedlock.core.SchedulerLock;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class CardScheduler {
    private final CardService cardService;

    @Scheduled(cron = "0 0 3 * * *")
    @SchedulerLock(name = "increaseAllCardBalances", lockAtLeastForString = "PT15M", lockAtMostForString = "PT1H")
    public void increaseAllCardBalances() {
        cardService.increaseAllCardBalances();
    }
}
