package module_micro_api_helloworld.api;

import module_micro_api_helloworld.model.*;
import com.github.microprograms.micro_api_runtime.model.Api;
import com.github.microprograms.micro_api_runtime.enums.ReserveResponseCodeEnum;
import com.github.microprograms.micro_api_runtime.exception.PassthroughException;
import com.github.microprograms.micro_api_runtime.annotations.MicroApi;
import com.github.microprograms.micro_api_runtime.annotations.Comment;
import java.util.List;
import com.github.microprograms.micro_api_runtime.model.Request;
import com.github.microprograms.micro_api_runtime.model.Response;
import com.github.microprograms.micro_api_runtime.annotations.Required;

@MicroApi(name = "welcome", version = "v3.0.0")
@Comment("welcome接口")
public class Welcome implements Api {

    @Override
    public String execute(String request) throws Exception {
        throw new PassthroughException(ReserveResponseCodeEnum.api_not_implemented_exception);
    }

    public static class Req extends Request {

        @Comment("名字")
        @Required
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Comment("重复次数")
        @Required
        private Integer repeat;

        public Integer getRepeat() {
            return repeat;
        }

        public void setRepeat(Integer repeat) {
            this.repeat = repeat;
        }
    }

    public static class Resp extends Response {

        @Comment("欢迎语")
        @Required
        private String word;

        public String getWord() {
            return word;
        }

        public void setWord(String word) {
            this.word = word;
        }
    }
}
