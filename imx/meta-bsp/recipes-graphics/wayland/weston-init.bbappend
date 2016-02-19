FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " file://weston-launch-init"

USE_WESTON_LAUNCH = "${@base_contains("DISTRO_FEATURES", "x11", "yes", "no", d)}"

do_install_append() {	

    if [ "${USE_WESTON_LAUNCH}" = "yes" ]; then  
	install -d ${D}/${sysconfdir}/init.d      
        install -m755 ${WORKDIR}/weston-launch-init ${D}/${sysconfdir}/init.d/weston
    fi    
}
