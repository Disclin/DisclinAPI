package pw.dotdash.disclin.api.entity.message

import pw.dotdash.disclin.api.entity.Snowflake

interface MessageApplication {

    val id: Snowflake

    val coverImage: String

    val description: String

    val icon: String

    val name: String
}