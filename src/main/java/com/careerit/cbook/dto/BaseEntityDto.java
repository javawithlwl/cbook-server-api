package com.careerit.cbook.dto;



import lombok.*;

import java.time.LocalDateTime;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class BaseEntityDto {

    private boolean deleted;
     private LocalDateTime createdDate;
     private LocalDateTime modifiedDate;
}
