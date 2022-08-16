# Copyright 2022 NXP
SUMMARY = "Freescale i.MX firmware for i.MX 9 family"
DESCRIPTION = "Freescale i.MX firmware for i.MX 9 family"

require recipes-bsp/firmware-imx/firmware-imx-${PV}.inc

inherit deploy

do_install[noexec] = "1"

do_deploy() {
    # Synopsys DDR
    for ddr_firmware in ${DDR_FIRMWARE_NAME}; do
        install -m 0644 ${S}/firmware/ddr/synopsys/${ddr_firmware} ${DEPLOYDIR}
    done
}
addtask deploy after do_install before do_build

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

COMPATIBLE_MACHINE = "(mx9-nxp-bsp)"
