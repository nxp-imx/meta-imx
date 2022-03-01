# Copyright (C) 2013-2016 Freescale Semiconductor
# Copyright 2018 (C) O.S. Systems Software LTDA.
# Copyright 2017-2021 NXP

require recipes-bsp/u-boot/u-boot.inc
require recipes-bsp/u-boot/u-boot-imx-common_${PV}.inc

PROVIDES += "u-boot"

UBOOT_SRC ?= "git://source.codeaurora.org/external/imx/uboot-imx.git;protocol=https"
SRCBRANCH = "lf_v2021.04"
SRC_URI = "${UBOOT_SRC};branch=${SRCBRANCH}"
SRCREV = "f7b43f8b4c1e4e3ee6c6ff2fe9c61b2092e8b96b"

LOCALVERSION = "-${SRCBRANCH}"

do_deploy:append:mx8m() {
    # Deploy u-boot-nodtb.bin and fsl-imx8m*-XX.dtb for mkimage to generate boot binary
    if [ -n "${UBOOT_CONFIG}" ]
    then
        for config in ${UBOOT_MACHINE}; do
            i=$(expr $i + 1);
            for type in ${UBOOT_CONFIG}; do
                j=$(expr $j + 1);
                if [ $j -eq $i ]
                then
                    install -d ${DEPLOYDIR}/${BOOT_TOOLS}
                    install -m 0777 ${B}/${config}/arch/arm/dts/${UBOOT_DTB_NAME}  ${DEPLOYDIR}/${BOOT_TOOLS}
                    install -m 0777 ${B}/${config}/u-boot-nodtb.bin  ${DEPLOYDIR}/${BOOT_TOOLS}/u-boot-nodtb.bin-${MACHINE}-${type}
                fi
            done
            unset  j
        done
        unset  i
    fi
}

UBOOT_TAGGED_BINARY ?= "u-boot-tagged.${UBOOT_SUFFIX}"

deploy_tag() {
    # Append a tag to the bootloader image used in the SD card image
    cp ${UBOOT_BINARY} ${UBOOT_TAGGED_BINARY}
    ln -sf ${UBOOT_TAGGED_BINARY} ${UBOOT_BINARY}
    stat -L -cUUUBURNXXOEUZX7+A-XY5601QQWWZ%sEND ${UBOOT_BINARY} >> ${UBOOT_BINARY}
}

do_deploy:append:mx6() {
    deploy_tag
}

do_deploy:append:mx7() {
    deploy_tag
}

PACKAGE_ARCH = "${MACHINE_ARCH}"
COMPATIBLE_MACHINE = "(mx6|mx7|mx8)"

UBOOT_NAME:mx6 = "u-boot-${MACHINE}.bin-${UBOOT_CONFIG}"
UBOOT_NAME:mx7 = "u-boot-${MACHINE}.bin-${UBOOT_CONFIG}"
UBOOT_NAME:mx8 = "u-boot-${MACHINE}.bin-${UBOOT_CONFIG}"
