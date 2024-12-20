package com.techie.backend.memo.dto;

import com.techie.backend.memo.domain.Memo;
import com.techie.backend.video.domain.Video;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemoResponse {
    private Long id;
    private String title;
    private String content;
    private String noteTime;
    private String videoId;
}
