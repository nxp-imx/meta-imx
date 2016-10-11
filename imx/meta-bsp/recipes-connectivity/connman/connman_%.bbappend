FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

# Using the enhanced verison of connman script.
#   - Fixes the issue that 2 Ethernet port board failed to mount nfs rootfs
#   - Support below kernel IP cfg parameters:  ip=:::::eth0:dhcp
#     (Support static ip address like: ip=10.192.242.179:10.192.242.47:10.192.242.254:255.255.255.0:imx:eth0:off)
