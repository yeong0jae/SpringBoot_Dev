package com.example.springboot_dev.Comment.Data;

import com.example.springboot_dev.Board.Data.BoardEntity;
import com.example.springboot_dev.User.Data.UserEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cid")
    private Long cid;

    @Column(name = "comment", nullable = false)
    private String comment;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "modified_at", nullable = false)
    private LocalDateTime modifiedAt;

    @ManyToOne
    @JoinColumn(name = "uid") // user의 uid를 참조
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "bid")  // board의 bid를 참조
    private BoardEntity board;

    @Builder
    public CommentEntity(String comment, LocalDateTime createdAt, LocalDateTime modifiedAt, UserEntity user, BoardEntity board) {
        this.comment = comment;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
        this.user = user;
        this.board = board;
    }


}
