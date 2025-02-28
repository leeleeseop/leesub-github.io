package com.beetmarket.reviewlike.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.beetmarket.reviewlike.mapper.ReviewLikeMapper;
import com.beetmarket.reviewlike.vo.ReviewLikeVO;

@Service
@Qualifier("ReviewLikeServiceImpl")
public class ReviewLikeServiceImpl implements ReviewLikeService {

    @Autowired
    private ReviewLikeMapper reviewLikeMapper;

     // 좋아요 개수를 조회
    @Override
    public int getLikeCount(Long reviewNo) {
        return reviewLikeMapper.countLikes(reviewNo);
    }

     // 좋아요를 추가
    @Override
    public void addLike(ReviewLikeVO likeVO) {
        // 좋아요가 이미 눌렸는지 확인
        if (reviewLikeMapper.userHasLiked(likeVO) == 0) {  // 좋아요가 눌리지 않은 경우
            reviewLikeMapper.addLike(likeVO);  // 좋아요 추가
        }
    }

    // 좋아요 취소
    @Override
    public void removeLike(ReviewLikeVO likeVO) {
        if (reviewLikeMapper.userHasLiked(likeVO) > 0) {  // 이미 좋아요를 누른 경우에만 삭제
            reviewLikeMapper.removeLike(likeVO);
        }
    }

    // 사용자가 좋아요를 눌렀는지 확인
    @Override
    public boolean userHasLiked(ReviewLikeVO likeVO) {
        return reviewLikeMapper.userHasLiked(likeVO) > 0;
    }
    
    

}
