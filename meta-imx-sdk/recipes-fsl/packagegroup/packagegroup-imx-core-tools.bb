# Copyright 2018-2020,2022 NXP
# Released under the MIT license (see COPYING.MIT for the terms)

DESCRIPTION = "Packagegroup to provide necessary tools for basic core image"

PACKAGE_ARCH = "${MACHINE_ARCH}"

inherit packagegroup

PIPEWIRE_TOOLS = " \
    pipewire \
    pipewire-pulse \
    pipewire-spa-tools \
    pipewire-tools \
    ${PIPEWIRE_V4L2} \
"
PIPEWIRE_V4L2 = "pipewire-v4l2"
PIPEWIRE_V4L2:mx6-nxp-bsp = ""
PIPEWIRE_V4L2:mx7-nxp-bsp = ""

RDEPENDS:${PN} = " \
    can-utils \
    coreutils \
    cpufrequtils \
    dosfstools \
    ethtool \
    evtest \
    e2fsprogs-mke2fs \
    e2fsprogs-resize2fs \
    fbset \
    fsl-rc-local \
    iproute2 iproute2-tc \
    iw \
    i2c-tools \
    kernel-tools-iio \
    kernel-tools-pci \
    kernel-tools-virtio \
    kernel-tools-vsock \
    spidev-test \
    libgpiod-tools \
    linuxptp \
    memtester \
    minicom \
    mmc-utils \
    mtd-utils \
    mtd-utils-ubifs \
    nano \
    parted \
    ${PIPEWIRE_TOOLS} \
    procps \
    ptpd \
    ntp \
    python3-core \
    python3-datetime \
    python3-json \
    udev-extraconf \
"
RDEPENDS:${PN}:append:mx95-nxp-bsp = " iproute2-devlink"
