package com.codingrecipe.member.dto;

import com.codingrecipe.member.entity.MemberEntity;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor // 기본생성자를 자동으로 만들어줌
@AllArgsConstructor // 필드를 모두 다 매개변수로하는 생성자를 만들어줌
@ToString
// 회원정보에 필요한 내용을 필드로 정의함, 필드를 사용하기 위해서는 getter, setter 필요해서 어노테이션 붙여줌
public class MemberDTO {
    private Long id;
    private String memberEmail;
    private String memberPassword;
    private String memberName;

    public static MemberDTO toMemberDTO(MemberEntity memberEntity) {
        MemberDTO memberDTO = new MemberDTO();
        memberDTO.setId(memberEntity.getId());
        memberDTO.setMemberEmail(memberEntity.getMemberEmail());
        memberDTO.setMemberPassword(memberEntity.getMemberPassword());
        memberDTO.setMemberName(memberEntity.getMemberName());
        return memberDTO;
    }
}
