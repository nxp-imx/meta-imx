SRCBRANCH = "master"
SRCREV = "399d65450e9a377b4aaff4b0627619174e1c8c46"

PV = "2023.03+git${SRCPV}"

ERROR_QA:remove = "buildpaths"
WARN_QA:append = " buildpaths"
