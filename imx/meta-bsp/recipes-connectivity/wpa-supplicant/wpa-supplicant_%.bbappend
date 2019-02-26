FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI =+ " \
     file://defconfig \
     file://0009-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
     file://0010-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
     file://0011-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
     file://0012-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
     file://0013-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
     file://0014-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
     file://0015-Sync-with-mac80211-next.git-include-uapi-linux-nl802.patch \
     file://0019-driver-Add-port-authorized-event.patch \
     file://0020-nl80211-Handle-port-authorized-event.patch \
     file://0021-wpa_supplicant-Handle-port-authorized-event.patch \
     file://0022-wpa_supplicant-Notify-Neighbor-Report-for-driver-tri.patch \
"
