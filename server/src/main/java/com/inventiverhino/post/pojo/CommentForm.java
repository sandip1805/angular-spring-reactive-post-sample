package com.inventiverhino.post.pojo;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;

@Document
@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentForm {
    @NotBlank
    private String content;
}
