package action;

import action.ActionForward;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor // 인자를 모두 받는 생성자
@NoArgsConstructor // default 생성자
public class ActionForward {
	private String path;
	private boolean isRedirect;
}
