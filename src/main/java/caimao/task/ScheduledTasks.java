package caimao.task;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;


/**
 * @author hutao <胡涛, hutao@coolqi.com>
 * @version v1.0
 * @project coolqi-backend-parent
 * @Description
 * @encoding UTF-8
 * @date 2016/12/7
 * @time 下午5:01
 * @修改记录 <pre>
 * 版本       修改人         修改时间         修改内容描述
 * --------------------------------------------------
 * <p>
 * --------------------------------------------------
 * </pre>
 */
@Component
@Slf4j
public class ScheduledTasks {
    private static final String COOL_QI_BACKGROUND_LEADER_LOCK_KEY = "COOL_QI_BACKGROUND_LEADER_LOCK";

    @Scheduled(cron = "0/5 * * * * ?")
    public void batchHandleDepositTask() {
        log.info(COOL_QI_BACKGROUND_LEADER_LOCK_KEY);
    }
}
