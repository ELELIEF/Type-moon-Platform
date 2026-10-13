-- auto-generated definition
create table admin
(
    adm_id       int auto_increment
        primary key,
    adm_name     varchar(255)                  not null,
    adm_password varchar(255) default '123456' not null,
    adm_level    int                           not null,
    constraint adm_name
        unique (adm_name)
);

-- auto-generated definition
create table tb_comments
(
    comment_id          int auto_increment
        primary key,
    post_id             int               not null,
    comment_text        text              not null,
    comment_author      varchar(100)      not null,
    comment_createdtime timestamp         not null,
    comment_updatedtime timestamp         null,
    is_deleted          tinyint default 1 not null,
    parent_id           int     default 0 not null,
    constraint fk_comments_post_id
        foreign key (post_id) references tb_posts (post_id)
            on delete cascade,
    constraint fk_comments_users_name
        foreign key (comment_author) references users (user_name)
);

-- auto-generated definition
create table tb_message
(
    com_id      int auto_increment
        primary key,
    com_name    varchar(255)                                    not null,
    com_type    varchar(10)                                     not null,
    com_theme   varchar(20)                                     not null,
    com_date    date                                            null,
    com_story   text                                            null,
    com_img     varchar(255) default '@/assets/imgs/Ycover.jpg' null,
    com_backimg varchar(255) default 'error'                    null
);

-- auto-generated definition
create table tb_posts
(
    post_id          int auto_increment
        primary key,
    post_title       varchar(255)      not null,
    post_content     text              not null,
    post_author      varchar(100)      not null,
    post_status      tinyint default 1 null,
    post_createdtime timestamp         not null,
    post_updatedtime timestamp         not null,
    post_commentnum  int     default 0 not null,
    constraint fk_posts_users_name
        foreign key (post_author) references users (user_name)
);

-- auto-generated definition
create table users
(
    user_id       int auto_increment
        primary key,
    user_name     varchar(255)                           not null,
    user_age      tinyint                                not null,
    user_password varchar(255) default '123456'          not null,
    user_regtime  timestamp    default CURRENT_TIMESTAMP not null,
    user_uid      varchar(255)                           not null,
    user_sex      tinyint      default 0                 not null,
    constraint user_name
        unique (user_name),
    constraint user_uid
        unique (user_uid)
);

