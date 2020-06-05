package com.javaniuniu.generator.mapper;

import com.javaniuniu.generator.domain.Upvote;
import com.javaniuniu.generator.domain.example.UpvoteExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UpvoteMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    long countByExample(UpvoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    int deleteByExample(UpvoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    int insert(Upvote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    int insertSelective(Upvote record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    Upvote selectOneByExample(UpvoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    Upvote selectOneByExampleSelective(@Param("example") UpvoteExample example, @Param("selective") Upvote.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    List<Upvote> selectByExampleSelective(@Param("example") UpvoteExample example, @Param("selective") Upvote.Column ... selective);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    List<Upvote> selectByExample(UpvoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Upvote record, @Param("example") UpvoteExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table upvote
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Upvote record, @Param("example") UpvoteExample example);
}