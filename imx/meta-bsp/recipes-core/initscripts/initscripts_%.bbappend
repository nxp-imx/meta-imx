# Append to remove /proc/cpu/aligntment from alignmnet script
FILESEXTRAPATHS_prepend := "${THISDIR}/arm:"

SRC_URI_append_imx = " file://alignment.sh "

# file to support gpu load services
SRC_URI_append_imxgpu2d = " file://gpuload \
                       file://gpuload.service"

do_install_append_imxgpu2d () {
    install -d ${D}/usr/bin
    install -d ${D}/lib/systemd/system
    install -m 0755 ${WORKDIR}/gpuload ${D}/usr/bin
    install -m 0644 ${WORKDIR}/gpuload.service ${D}/lib/systemd/system
}

#pkg_postinst_${PN}_append_imxgpu2d () {
#    #!/bin/sh
#    ln -s /lib/systemd/system/gpuload.service /etc/systemd/system/multi-user.target.wants/
#}

FILES_${PN}_append_imxgpu2d = " /lib/systemd/system/gpuload.service /usr/bin/gpuload"
PACKAGE_ARCH = "${MACHINE_ARCH}"
