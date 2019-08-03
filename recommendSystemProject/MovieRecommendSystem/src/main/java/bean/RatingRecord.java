package bean;

import java.io.Serializable;

/**
 * 评分记录
 */
public class RatingRecord implements Serializable{

    private Integer userId; //用户
    private Integer movieId; //电影
    private Double rating; //用户评分
    private Long timestamp; //评分时间戳

}
