package shop.mshop.message.request;

import lombok.Data;

@Data
public class CommentNoticeWriteRequest {
    private Long noticeId;
    private String comment;
}
