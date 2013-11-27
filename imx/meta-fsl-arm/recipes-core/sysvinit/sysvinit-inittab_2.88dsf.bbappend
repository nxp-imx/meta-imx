# Freescale imx extra configuration 
FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

PRINC := "${@int(PRINC) + 1}"

SRC_URI_append_mx6 = " file://rc_mxc.S file://rc_gpu.S"

USE_X11 = "${@base_contains("DISTRO_FEATURES", "x11", "yes", "no", d)}"

# overirde do_install
do_install_mx6() {
	install -d ${D}${sysconfdir}

	# Install rc_mxc.S to /etc/init.d
	install -d ${D}${sysconfdir} ${D}${sysconfdir}/init.d
	install -m 0755 ${WORKDIR}/rc_mxc.S ${D}${sysconfdir}/init.d

    install -m 0644 ${WORKDIR}/inittab ${D}${sysconfdir}/inittab

    echo "mxc::respawn:/etc/init.d/rc_mxc.S" >> ${D}${sysconfdir}/inittab

    tmp="${SERIAL_CONSOLES}"
    for i in $tmp
    do
	j=`echo ${i} | sed s/\;/\ /g`
	label=`echo ${i} | sed -e 's/^.*;tty//'`
	# comment these lines off
	echo "#$label:12345:respawn:${base_sbindir}/getty ${j}" >> ${D}${sysconfdir}/inittab
    done

    if [ "${USE_VT}" = "1" ]; then
        cat <<EOF >>${D}${sysconfdir}/inittab
# ${base_sbindir}/getty invocations for the runlevels.
#
# The "id" field MUST be the same as the last
# characters of the device (after "tty").
#
# Format:
#  <id>:<runlevels>:<action>:<process>
#

EOF

        for n in ${SYSVINIT_ENABLED_GETTYS}
        do
            echo "$n:2345:respawn:${base_sbindir}/getty 38400 tty$n" >> ${D}${sysconfdir}/inittab
        done
        echo "" >> ${D}${sysconfdir}/inittab
    fi

    # Add rc_gpu.s for non-X11 backend
    if [ "${USE_X11}" = "no" ]; then
	echo "gpu::sysinit:/etc/init.d/rc_gpu.S"
        echo "gpu::sysinit:/etc/init.d/rc_gpu.S" >> ${D}${sysconfdir}/inittab
	install -m 0755 ${WORKDIR}/rc_gpu.S ${D}${sysconfdir}/init.d
    else
	echo "X11 -- no gpu::sysinit:/etc/init.d/rc_gpu.S"
    fi

}

FILES_${PN}_append_mx6 = " ${sysconfdir}/init.d/rc_mxc.S ${sysconfdir}/init.d/rc_gpu.S"

PACKAGE_ARCH_mx6 = "${MACHINE_ARCH}"


