package pw.dotdash.disclin.api.entity.guild

enum class Region(val id: String, val displayName: String, val vip: Boolean = false) {

    AMSTERDAM("amsterdam", "Amsterdam"),
    BRAZIL("brazil", "Brazil"),
    EU_WEST("eu-west", "EU West"),
    EU_CENTRAL("eu-central", "EU Central"),
    FRANKFURT("frankfurt", "Frankfurt"),
    HONG_KONG("hongkong", "Hong Kong"),
    JAPAN("japan", "Japan"),
    LONDON("london", "London"),
    RUSSIA("russia", "Russia"),
    SINGAPORE("singapore", "Singapore"),
    SOUTH_AFRICA("south-africa", "South Africa"),
    SYDNEY("sydney", "Sydney"),
    US_EAST("us-east", "US East"),
    US_WEST("us-west", "US West"),
    US_CENTRAL("us-central", "US Central"),
    US_SOUTH("us-south", "US South"),

    VIP_AMSTERDAM("vip-amsterdam", "Amsterdam (VIP)", true),
    VIP_BRAZIL("vip-brazil", "Brazil (VIP)", true),
    VIP_EU_WEST("vip-eu-west", "EU West (VIP)", true),
    VIP_EU_CENTRAL("vip-eu-central", "EU Central (VIP)", true),
    VIP_FRANKFURT("vip-frankfurt", "Frankfurt (VIP)", true),
    VIP_HONG_KONG("vip-hongkong", "Hong Kong (VIP)", true),
    VIP_JAPAN("vip-japan", "Japan (VIP)", true),
    VIP_LONDON("vip-london", "London (VIP)", true),
    VIP_RUSSIA("vip-russia", "Russia (VIP)", true),
    VIP_SINGAPORE("vip-singapore", "Singapore (VIP)", true),
    VIP_SOUTH_AFRICA("vip-south-africa", "South Africa (VIP)", true),
    VIP_SYDNEY("vip-sydney", "Sydney (VIP)", true),
    VIP_US_EAST("vip-us-east", "US East (VIP)", true),
    VIP_US_WEST("vip-us-west", "US West (VIP)", true),
    VIP_US_CENTRAL("vip-us-central", "US Central (VIP)", true),
    VIP_US_SOUTH("vip-us-south", "US South (VIP)", true);
}