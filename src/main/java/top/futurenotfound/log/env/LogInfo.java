package top.futurenotfound.log.env;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class LogInfo {
    private String operator;
    private String timestamp;
    private String logContent;

    private String modelName;
}
