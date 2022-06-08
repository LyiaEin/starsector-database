#usertable
drop table if exists user_list;
create table user_list
(
    id varchar(64) not null primary key comment '用户id',
    username varchar(64) not null comment '用户名',
    password varchar(32) not null comment '密码',
    nickname varchar(64) not null comment '昵称',
    phone_number varchar(11) comment '电话号码',
    email varchar (64) comment '电子邮件',
    is_del tinyint comment '删除标记',
    create_time datetime comment '创建时间',
    modify_time datetime comment '修改时间'
) engine innoDB character set utf8 collate utf8_general_ci;

ALTER TABLE blog_list CHANGE is_del is_del tinyint NOT NULL default 0 COMMENT '删除标记';


#blogtable
drop table if exists blog_list;
create table blog_list
(
    id varchar(64) not null primary key comment '博客id',
    topic varchar(256) not null comment '标题',
    summary varchar(120) not null comment '摘要',
    content text not null comment '内容',
    uid varchar(64) not null comment '用户ID',
    is_del tinyint comment '删除标记',
    create_time datetime comment '创建时间',
    modify_time datetime comment '修改时间'
) engine innoDB character set utf8 collate utf8_general_ci;


#comment_list
DROP TABLE IF EXISTS comment_list;
CREATE TABLE comment_list(
    id VARCHAR(64) not null primary key comment  '评论ID' ,
    cid VARCHAR(64) COMMENT '评论ID' ,
    bid VARCHAR(64) NOT NULL   COMMENT '博客ID' ,
    content VARCHAR(1024) NOT NULL   COMMENT '评论内容' ,
    from_id VARCHAR(64) NOT NULL   COMMENT '评论人ID' ,
    is_del tinyint    COMMENT '删除标记' ,
    create_time datetime  COMMENT '创建时间' ,
    modify_time datetime  COMMENT '修改时间'
) engine innoDB character set utf8 collate utf8_general_ci;




