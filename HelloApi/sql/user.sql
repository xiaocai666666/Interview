-- 建表语句
create table user
(
    id          bigint auto_increment comment '主键'
        primary key,
    name        varchar(32) null comment '姓名',
    sex         varchar(2)  null comment '性别',
    password    varchar(64) not null comment '密码',
    create_time datetime    null,
    username    varchar(32) not null comment '用户名',
    constraint user_pk
        unique (username)
)
    comment '用户信息';
