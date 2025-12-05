SRCREV_edk2           ?= "6951dfe7d59d144a3a980bd7eda699db2d8554ac"
SRCREV_edk2-platforms ?= "f92f7dd154c94286df38979ebb0e2b74a243b17d"

require edk2-firmware.inc

TOOLCHAIN:aarch64 = "gcc"

SRC_URI += " file://edk2_fix_epoch.patch"