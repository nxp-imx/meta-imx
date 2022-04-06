FILESEXTRAPATHS:prepend := "${THISDIR}/${BPN}:"

####################################################################################
# Use tag v251-rc1 to resolve the NFS rootfs connection lost after suspend/resume
SRCREV = "0f6f9dc6cf593476dc3e1d2403e78c0777e28166"
SRC_URI:remove = "git://github.com/systemd/systemd-stable.git;protocol=https;branch=${SRCBRANCH}"
SRC_URI:append = "git://github.com/systemd/systemd-stable.git;protocol=https;nobranch=1"

SRC_URI:remove = "file://0029-network-enable-KeepConfiguration-when-running-on-net.patch"
####################################################################################
SRC_URI += " \
            file://0001-systemd-udevd.service.in-Set-PrivateMounts-to-no-to-.patch \
            file://0020-logind.conf-Set-HandlePowerKey-to-ignore.patch \
"
do_install:append () {
    # Disable the assignment of the fixed network interface name
    install -d ${D}${sysconfdir}/systemd/network
    ln -s /dev/null ${D}${sysconfdir}/systemd/network/99-default.link

    # Add special touchscreen rules
    if [ -e  ${D}${sysconfdir}/udev/rules.d/touchscreen.rules ]; then
        cat <<EOF >>${D}${sysconfdir}/udev/rules.d/touchscreen.rules
# i.MX specific touchscreen rules
SUBSYSTEM=="input", KERNEL=="event[0-9]*", ENV{ID_INPUT_TOUCHSCREEN}=="1", SYMLINK+="input/touchscreen0"
EOF
    fi
}
