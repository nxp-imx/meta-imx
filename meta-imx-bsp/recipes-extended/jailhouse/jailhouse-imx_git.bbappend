FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-Revert-driver-sysfs-Update-bin_attribute-version-che.patch"
SRC_URI:remove = "file://0001-YOCIMX-9281-1-Fix-gcc15-errors.patch \
                  file://0002-YOCIMX-9281-2-hypervisor-arm64-fix-strh-usage.patch"
SRCBRANCH = "lf-6.12.49_2.2.0"
SRCREV = "d2e563cbfdbf6cdfa6be60bb626b566bddb1f101"

PV = "2023.03+git${SRCPV}"

ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"

INSANE_SKIP:${PN}:remove = "ldflags"
ERROR_QA:remove = "ldflags"
WARN_QA:append = " ldflags"
