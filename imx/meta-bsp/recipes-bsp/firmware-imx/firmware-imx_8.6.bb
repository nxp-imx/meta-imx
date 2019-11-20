# Copyright (C) 2012-2016 Freescale Semiconductor
# Copyright 2017-2019 NXP
# Copyright (C) 2018 O.S. Systems Software LTDA.
SUMMARY = "Freescale i.MX firmware"
DESCRIPTION = "Freescale i.MX firmware such as for the VPU"

require firmware-imx-${PV}.inc

SRC_URI_append = " \
    file://sdma \
    file://epdc \
    file://regulatory \
    file://sdma-firmware.service \
    file://epdc-firmware.service \
    file://regulatory-firmware.service \
"

PE = "1"

inherit allarch systemd

SYSTEMD_PACKAGES = "${PN}-sdma ${PN}-epdc ${PN}-regulatory"
SYSTEMD_SERVICE_${PN}-sdma = "sdma-firmware.service"
SYSTEMD_SERVICE_${PN}-epdc = "epdc-firmware.service"
SYSTEMD_SERVICE_${PN}-regulatory = "regulatory-firmware.service"

do_install() {
    install -d ${D}${base_libdir}/firmware/imx

    if ${@bb.utils.contains('DISTRO_FEATURES','systemd','true','false',d)}; then
        install -d ${D}${sysconfdir}
        install -d ${D}${systemd_system_unitdir}
        install -m 0755 ${WORKDIR}/sdma ${D}${sysconfdir}
        install -m 0755 ${WORKDIR}/epdc ${D}${sysconfdir}
        install -m 0755 ${WORKDIR}/regulatory ${D}${sysconfdir}
        install -m 0644 ${WORKDIR}/sdma-firmware.service ${D}${systemd_system_unitdir}
        install -m 0644 ${WORKDIR}/epdc-firmware.service ${D}${systemd_system_unitdir}
        install -m 0644 ${WORKDIR}/regulatory-firmware.service ${D}${systemd_system_unitdir}
    fi

    cd firmware
    for d in *; do
        case $d in
        easrc)
            # excluding as only applies Nano SoC
            ;;
        ddr|hdmi|seco)
            # These folders are for i.MX 8 and are included in the boot image via imx-boot
            bbnote Excluding folder $d
            ;;
        *)
            cp -rfv $d ${D}${base_libdir}/firmware
            ;;
        esac
    done
    cd -

    # Install SDMA Firmware: sdma-imx6q.bin & sdma-imx7d.bin into lib/firmware/imx/sdma
    install -d ${D}${base_libdir}/firmware/imx/sdma
    mv ${D}${base_libdir}/firmware/sdma/sdma-imx6q.bin ${D}${base_libdir}/firmware/imx/sdma
    mv ${D}${base_libdir}/firmware/sdma/sdma-imx7d.bin ${D}${base_libdir}/firmware/imx/sdma

    mv ${D}${base_libdir}/firmware/epdc/ ${D}${base_libdir}/firmware/imx/epdc/
    mv ${D}${base_libdir}/firmware/imx/epdc/epdc_ED060XH2C1.fw.nonrestricted ${D}${base_libdir}/firmware/imx/epdc/epdc_ED060XH2C1.fw

    find ${D}${base_libdir}/firmware -type f -exec chmod 644 '{}' ';'
    find ${D}${base_libdir}/firmware -type f -exec chown root:root '{}' ';'

    # Remove files not going to be installed
    find ${D}${base_libdir}/firmware/ -name '*.mk' -exec rm '{}' ';'
}

python populate_packages_prepend() {
    vpudir = bb.data.expand('${base_libdir}/firmware/vpu', d)
    do_split_packages(d, vpudir, '^vpu_fw_([^_]*).*\.bin',
                      output_pattern='firmware-imx-vpu-%s',
                      description='Freescale IMX Firmware %s',
                      extra_depends='',
                      prepend=True)

    sdmadir = bb.data.expand('${base_libdir}/firmware/sdma', d)
    do_split_packages(d, sdmadir, '^sdma-([^-]*).*\.bin',
                      output_pattern='firmware-imx-sdma-%s',
                      description='Freescale IMX Firmware %s',
                      extra_depends='',
                      prepend=True)
}

ALLOW_EMPTY_${PN} = "1"

PACKAGES_DYNAMIC = "${PN}-vpu-* ${PN}-sdma-*"

PACKAGES =+ "${PN}-epdc ${PN}-scfw ${PN}-sdma ${PN}-regulatory"

RDEPENDS_${PN}-epdc = "bash"
RDEPENDS_${PN}-sdma = "bash"
RDEPENDS_${PN}-regulatory = "bash"

FILES_${PN}-epdc = "${base_libdir}/firmware/imx/epdc/ ${sysconfdir}/epdc ${systemd_system_unitdir}/epdc-firmware.service"
FILES_${PN}-scfw = "${base_libdir}/firmware/scfw/"
FILES_${PN}-sdma = "${base_libdir}/firmware/imx/sdma ${sysconfdir}/sdma ${systemd_system_unitdir}/sdma-firmware.service"
FILES_${PN}-regulatory = "${sysconfdir}/regulatory ${systemd_system_unitdir}/regulatory-firmware.service"

COMPATIBLE_MACHINE = "(imx)"
