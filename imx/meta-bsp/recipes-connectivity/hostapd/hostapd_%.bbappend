# Disable hostapd service when system boot up
INITSCRIPT_NAME = ""

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI += " \
    file://defconfig \
    file://0009-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
    file://0010-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
    file://0011-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
    file://0012-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
    file://0013-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
    file://0014-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
    file://0015-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
    file://0016-driver_nl80211-support-passing-PSK-on-connect.patch \
    file://0017-driver_nl80211-check-4-way-handshake-offload-support.patch \
    file://0018-nl80211-Add-API-to-set-the-PMK-to-the-driver.patch \
    file://0019-driver-Add-port-authorized-event.patch \
    file://0020-nl80211-Handle-port-authorized-event.patch \
    file://0023-driver_nl80211-Fix-802.1X-auth-failure-when-offloadi.patch \
    file://0024-defconfig-enable-p2p-and-AP-configs-for-hostapd.patch \
"
