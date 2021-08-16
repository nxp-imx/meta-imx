# Drop the poky hardknott commit 6bb1621815f41fd09c971a0e26fb4bcd0963ab8a
#   As the script cannot handle the element MetricName

base_do_configure:prepend () {
    # Drop the feature for sort pmu-event
    if [ -e "${S}/tools/perf/pmu-events/Build" ]; then
        replacement1='$(srctree)/sort-pmuevents.py $(OUTPUT)pmu-events/pmu-events.c $(OUTPUT)pmu-events/pmu-events.c.new'
        replacement2='cp $(OUTPUT)pmu-events/pmu-events.c.new $(OUTPUT)pmu-events/pmu-events.c'
        sed -i -e "s,$replacement1,,g" "${S}/tools/perf/pmu-events/Build"
        sed -i -e "s,$replacement2,,g" "${S}/tools/perf/pmu-events/Build"
    fi
    # End of drop the feature for sort pmu-event
}
