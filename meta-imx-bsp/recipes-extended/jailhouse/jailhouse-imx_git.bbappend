FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://0001-Revert-driver-sysfs-Update-bin_attribute-version-che.patch"
SRC_URI:remove = "file://0001-YOCIMX-9281-1-Fix-gcc15-errors.patch \
                  file://0002-YOCIMX-9281-2-hypervisor-arm64-fix-strh-usage.patch"
SRCBRANCH = "lf-6.18.37_2.1.0"
SRCREV = "8ce492bb2c69e486b8afb655f87d8b4708c79d89"

PV = "2023.03+git${SRCPV}"

# Rebuild against the current kernel; resolve kernel-module version-hash conflict
do_compile[depends] += "virtual/kernel:do_shared_workdir"

FILES:${PN}-bash-completion = "${datadir}/bash-completion/completions/jailhouse"

ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"

INSANE_SKIP:${PN}:remove = "ldflags"
ERROR_QA:remove = "ldflags"
WARN_QA:append = " ldflags"
