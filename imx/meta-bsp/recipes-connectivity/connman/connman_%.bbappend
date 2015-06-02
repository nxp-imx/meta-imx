
do_install_append() {
     # This patch will fix to the issue that 2 Ethernet port board failed to mount nfs rootfs
    if [ -e ${D}${sysconfdir}/init.d/connman ]; then
        sed -e 's/ifconfig | grep \"^eth\" | sed -e \"s\//dmesg | grep \"device=eth\" | sed -e \"s\/^.*/' -i ${D}${sysconfdir}/init.d/connman
    fi
}
